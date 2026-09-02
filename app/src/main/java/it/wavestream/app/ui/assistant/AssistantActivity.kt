package it.wavestream.app.ui.assistant

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.compose.runtime.collectAsState
import it.wavestream.app.data.database.entity.ContentType
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.player.PlayerActivity
import it.wavestream.app.ui.theme.WaveStreamTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

/**
 * Assistente vocale AI: schermata a schermo intero con orb futuristica,
 * conversazione vocale (audio → Gemini) e carosello dei risultati sfogliabile col D-pad.
 */
@AndroidEntryPoint
class AssistantActivity : ComponentActivity() {

    private val viewModel: AssistantViewModel by viewModels()

    private val requestMicPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) viewModel.onMicPressed()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WaveStreamTheme {
                val uiState = viewModel.uiState.collectAsState().value
                AssistantScreen(
                    uiState = uiState,
                    onMicPressed = ::onMicPressed,
                    onResultSelected = viewModel::onResultSelected
                )
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.events.collect { event ->
                    when (event) {
                        is AssistantViewModel.Event.OpenContent -> openContent(event.item)
                    }
                }
            }
        }
    }

    private fun onMicPressed() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
            == PackageManager.PERMISSION_GRANTED
        ) {
            viewModel.onMicPressed()
        } else {
            requestMicPermission.launch(Manifest.permission.RECORD_AUDIO)
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
