package com.example.test_new_star_prnt_lib

import io.flutter.embedding.android.FlutterActivity

import android.content.Context
import android.graphics.*
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.Log
import androidx.annotation.NonNull
//import com.starmicronics.stario.PortInfo
//import com.starmicronics.stario.StarIOPort
//import com.starmicronics.stario.StarPrinterStatus
//import com.starmicronics.starioextension.ICommandBuilder
//import com.starmicronics.starioextension.ICommandBuilder.*
//import com.starmicronics.starioextension.IConnectionCallback
//import com.starmicronics.starioextension.StarIoExt
//import com.starmicronics.starioextension.StarIoExt.Emulation
//import com.starmicronics.starioextension.StarIoExtManager
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        MethodChannel(flutterEngine.dartExecutor,"flutter/StarPrint").setMethodCallHandler{
                call,result ->
            when (call.method) {
                "portDiscovery" -> {
                    //portDiscovery(call, result)
                }
                "checkStatus" -> {
                    //checkStatus(call, result)
                }
                "print" -> {
                    //print(call, result)
                }
                else -> result.notImplemented()
            }
//            when (call.method=="Print"){
//                val folder = File(Environment.getExternalStorageDirectory().path + "/Download")
//                val allFiles: Array<File> = folder.listFiles()
//                val list = Arrays.asList(allFiles)
//                var imgs = ArrayList<String>()
//                if (list.size >= 1) {
//                    for (i in 0..list[0].size - 1) {
//                        imgs.add(list[0][i].toString())
//                    }
//                }
//                if (imgs.size <= 0) {
//                    result.error("Empty", "No Documents.", null);
//                } else {
//                    result.success(imgs);
//                }
//            }

        }
    }

//    public fun portDiscovery(@NonNull call: MethodCall, @NonNull result: Result) {
//        val strInterface: String = call.argument<String>("type") as String
//        val response: MutableList<Map<String, String>>
//        try {
//            if (strInterface == "LAN") {
//                response = getPortDiscovery("LAN")
//            } else if (strInterface == "Bluetooth") {
//                response = getPortDiscovery("Bluetooth")
//            } else if (strInterface == "USB") {
//                response = getPortDiscovery("USB")
//            } else {
//                response = getPortDiscovery("All")
//            }
//            result.success(response)
//        } catch (e: Exception) {
//            result.error("PORT_DISCOVERY_ERROR", e.message, null)
//        }
//    }
//
//    private fun getPortDiscovery(@NonNull interfaceName: String): MutableList<Map<String, String>> {
//        val arrayDiscovery: MutableList<PortInfo> = mutableListOf<PortInfo>()
//        val arrayPorts: MutableList<Map<String, String>> = mutableListOf<Map<String, String>>()
//
//        if (interfaceName == "Bluetooth" || interfaceName == "All") {
//            for (portInfo in StarIOPort.searchPrinter("BT:")) {
//                arrayDiscovery.add(portInfo)
//            }
//        }
//        if (interfaceName == "LAN" || interfaceName == "All") {
//            for (port in StarIOPort.searchPrinter("TCP:")) {
//                arrayDiscovery.add(port)
//            }
//        }
//        if (interfaceName == "USB" || interfaceName == "All") {
//            try {
//                for (port in StarIOPort.searchPrinter("USB:", applicationContext)) {
//                    arrayDiscovery.add(port)
//                }
//            } catch (e: Exception) {
//                Log.e("FlutterStarPrnt", "usb not conncted", e)
//            }
//        }
//        for (discovery in arrayDiscovery) {
//            val port: MutableMap<String, String> = mutableMapOf<String, String>()
//
//            if (discovery.getPortName().startsWith("BT:"))
//                port.put("portName", "BT:" + discovery.getMacAddress())
//            else port.put("portName", discovery.getPortName())
//
//            if (!discovery.getMacAddress().equals("")) {
//
//                port.put("macAddress", discovery.getMacAddress())
//
//                if (discovery.getPortName().startsWith("BT:")) {
//                    port.put("modelName", discovery.getPortName())
//                } else if (!discovery.getModelName().equals("")) {
//                    port.put("modelName", discovery.getModelName())
//                }
//            } else if (interfaceName.equals("USB") || interfaceName.equals("All")) {
//                if (!discovery.getModelName().equals("")) {
//                    port.put("modelName", discovery.getModelName())
//                }
//                if (!discovery.getUSBSerialNumber().equals(" SN:")) {
//                    port.put("USBSerialNumber", discovery.getUSBSerialNumber())
//                }
//            }
//
//            arrayPorts.add(port)
//        }
//
//        return arrayPorts
//    }

}
