package uz.coder.daggerhilt.ui.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import uz.coder.daggerhilt.R
import uz.coder.daggerhilt.databinding.FragmentAllNewsBinding
import uz.coder.daggerhilt.utils.UserResource
import uz.coder.daggerhilt.viewmodels.MyViewModel

@DelicateCoroutinesApi
class AllNewsFragment : Fragment(R.layout.fragment_all_news) {

    private val binding: FragmentAllNewsBinding by viewBinding()
    private val myViewModel: MyViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //    myViewModel = ViewModelProvider.get(this)[MyViewModel::class.java]
/*

        GlobalScope.launch {
            withContext(Dispatchers.Main) {

                myViewModel.getNews().collect {
                    when (it) {
                        is UserResource.Error -> {


                        }
                        UserResource.Loading -> {


                        }
                        is UserResource.Success -> {


                        }
                    }


                }

            }
        }
*/

    }

}