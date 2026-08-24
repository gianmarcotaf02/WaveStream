package it.wavestream.app.ui.person

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import dagger.hilt.android.AndroidEntryPoint
import it.wavestream.app.ui.details.DetailsActivity
import it.wavestream.app.ui.theme.WaveStreamTheme

@AndroidEntryPoint
class PersonActivity : ComponentActivity() {

    private val viewModel: PersonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val personId = intent.getIntExtra("person_id", 0)
        val personName = intent.getStringExtra("person_name") ?: ""

        viewModel.loadPerson(personId, personName)

        setContent {
            WaveStreamTheme {
                val person by viewModel.person.collectAsState()
                val libraryMovies by viewModel.libraryMovies.collectAsState()
                val libraryTV by viewModel.libraryTV.collectAsState()
                val isLoading by viewModel.isLoading.collectAsState()

                PersonScreen(
                    person = person,
                    personName = personName,
                    libraryMovies = libraryMovies,
                    libraryTV = libraryTV,
                    isLoading = isLoading,
                    onBackClick = { finish() },
                    onContentClick = { contentId, contentType ->
                        val intent = Intent(this, DetailsActivity::class.java).apply {
                            putExtra("content_id", contentId)
                            putExtra("content_type", contentType.name)
                        }
                        startActivity(intent)
                    }
                )
            }
        }
    }
}
