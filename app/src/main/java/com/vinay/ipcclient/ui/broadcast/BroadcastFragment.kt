package com.vinay.ipcclient.ui.broadcast

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vinay.ipcclient.DATA
import com.vinay.ipcclient.PACKAGE_NAME
import com.vinay.ipcclient.PID
import com.vinay.ipcclient.databinding.FragmentBroadcastBinding
import android.os.Process
import java.util.*


class BroadcastFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentBroadcastBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBroadcastBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.btnConnect.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View?) {
        sendBroadcast()
        showBroadcastTime()
    }

    private fun sendBroadcast(){
        val intent = Intent()
        intent.action = "com.vinay.ipcclient"
        intent.putExtra(PACKAGE_NAME, context?.packageName)
        intent.putExtra(PID, Process.myPid().toString())
        intent.putExtra(DATA, binding.edtClientData.text.toString())
        intent.component = ComponentName("com.vinay.ipcserver", "com.vinay.ipcserver.IPCBroadcastReceiver")
        activity?.applicationContext?.sendBroadcast(intent)
    }

    private fun showBroadcastTime(){
        val cal = Calendar.getInstance()
        val time ="${cal.get(Calendar.HOUR)}:${cal.get(Calendar.MINUTE)}:${cal.get(Calendar.SECOND)}"
        binding.linearLayoutClientInfo.visibility = View.VISIBLE
        binding.txtDate.text = time
    }
}
