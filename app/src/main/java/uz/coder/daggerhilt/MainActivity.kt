package uz.coder.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import uz.coder.daggerhilt.utils.UserResource
import uz.coder.daggerhilt.viewmodels.UserViewModel
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@DelicateCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity(), CoroutineScope {

    private val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch {
            withContext(Dispatchers.Main){

                userViewModel.getUsers().collect {

                    when (it) {
                        is UserResource.Error -> {

                        }
                        UserResource.Loading -> {

                        }
                        is UserResource.Success -> {
                            println("alovuddin: ${it.list}")
                        }
                    }

                }
            }
        }


    }

    override val coroutineContext: CoroutineContext
        get() = Job()
}