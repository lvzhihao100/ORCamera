package com.gamerole.orcamera

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gamerole.orcameralib.CameraActivity
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        RxPermissions(this).request(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                .subscribe {
//                    if (it) {
        tvShouchi.setOnClickListener {
            startActivityForResult<CameraActivity>(1000,
                    CameraActivity.KEY_OUTPUT_FILE_PATH to File(filesDir, "1.jpg"),
                    CameraActivity.KEY_CONTENT_TYPE to CameraActivity.CONTENT_TYPE_GENERAL)
        }
        tvFront.setOnClickListener {
            startActivityForResult<CameraActivity>(1001,
                    CameraActivity.KEY_OUTPUT_FILE_PATH to File(filesDir, "2.jpg"),
                    CameraActivity.KEY_CONTENT_TYPE to CameraActivity.CONTENT_TYPE_ID_CARD_FRONT)
        }
        tvBack.setOnClickListener {
            startActivityForResult<CameraActivity>(1002,
                    CameraActivity.KEY_OUTPUT_FILE_PATH to File(filesDir, "3.jpg"),
                    CameraActivity.KEY_CONTENT_TYPE to CameraActivity.CONTENT_TYPE_ID_CARD_BACK)
        }
//                    } else {
//                        toast("需要开启照相权限")
//                    }
//    }


    }
}
