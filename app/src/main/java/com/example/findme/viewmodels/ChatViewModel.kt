package com.example.findme.viewmodels

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import io.getstream.chat.android.client.ChatClient
import kotlinx.coroutines.launch
import io.getstream.chat.android.models.User
import kotlinx.coroutines.launch
import io.getstream.result.Result.Failure
import io.getstream.result.Result.Success
import io.getstream.video.android.core.Call
import io.getstream.video.android.core.ClientState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ChatViewModel : ViewModel() {

    val client = ChatClient.instance()

    private val _clientToBeProvidedToVCS = MutableStateFlow<ChatClient?>(client)
    val clientToBeProvidedToVCS: StateFlow<ChatClient?> = _clientToBeProvidedToVCS

    fun connectUser() {

        viewModelScope.launch {

            val user = User(
                id = "bender",
                name = "Bender",
                image = "https://bit.ly/321RmWb",
            )

            /*val client = ChatClient.instance()

            _clientToBeProvidedToVCS.value = client*/

            client.connectUser(user = user, token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidHV0b3JpYWwtZHJvaWQifQ.WwfBzU1GZr0brt_fXnqKdKhz3oj0rbDUm2DqJO_SS5U").enqueue()

            // Make a request to your backend to generate a valid token for the user
            // Get the current Firebase user
//            val auth = FirebaseAuth.getInstance()
//            val user2 = auth.currentUser

            /*if (user2 != null) {
                // Asynchronously get the ID token
                user2.getIdToken(false).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // Get the token
                        val token = task.result?.token

                        // Static reference to initialised client
                        val client = ChatClient.instance()

                        // Connect the user with the token
                        client.connectUser(user = user, token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidHV0b3JpYWwtZHJvaWQifQ.WwfBzU1GZr0brt_fXnqKdKhz3oj0rbDUm2DqJO_SS5U").enqueue { result ->
                            when (result) {
                                is Failure -> {
                                    // Handle failure
                                }
                                is Success -> {
                                    // Handle success
                                }
                            }
                        }
                    } else {
                        // Handle the case where the token retrieval failed
                    }
                }
            } else {
                // Handle the case where there is no current user
            }*/
        }
    }
}