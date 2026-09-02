package it.wavestream.app.ui.assistant

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.theme.WaveStreamTheme
import it.wavestream.app.ui.components.OnboardingBackground
import kotlinx.coroutines.launch

/**
 * Assistente vocale AI: overlay a schermo intero con orb futuristica,
 * conversazione vocale (audio → Gemini) e carosello risultati.
 */
@AndroidEntryPoint
class AssistantActivity : ComponentActivity() {

    private val requestMicPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) {
                viewModel.startListeningInternal()
            }
        }

    // Lateinit: inizializzato in onCreate prima di ogni uso
    private lateinit var viewModel: AssistantViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = androidx.lifecycle.ViewModelProvider(
            this,
            androidx.lifecycle.ViewModelProvider.NewInstanceFactory()
        )[AssistantViewModel::class.java]

        setContent {
            WaveStreamTheme {
                AssistantRoute(
                    viewModel = viewModel,
                    onRequestMicPermission = { requestMicPermission.launch(Manifest.permission.RECORD_AUDIO) }
                )
            }
        }

        lifecycleScope.launch {
            viewModel.events.collect { event ->
                when (event) {
                    is AssistantViewModel.Event.OpenContent -> openContent(event.item)
                    is AssistantViewModel.Event.StartListening -> {
                        // non usato: la registrazione parte da AssistantRoute
                    }
                }
            }
        }
    }

    private fun openContent(item: it.wavestream.app.ai.AiResultItem) {
        val intent = when (item.type) {
            ContentType.CHANNEL -> Intent(this, PlayerActivity::class.java).apply {
                putExtra("content_id", item.id)
                putExtra("content_type", ContentType.CHANNEL.name)
                putExtra("stream_url", item.streamUrl ?: "")
                putExtra("title", item.title)
            }
            else -> Intent(this, DetailsActivity::class.java).apply {
                putExtra("content_id", item.id)
                putExtra("content_type", item.type.name)
                putExtra("title", item.title)
                putExtra("poster_url", item.imageUrl)
            }
        }
        startActivity(intent)
    }
}
