package org.wit.placemark.main

import android.app.Application
import android.widget.CheckBox
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.placemark.models.PlacemarkJSONStore
import org.wit.placemark.models.PlacemarkStore
import android.widget.Toast;
import org.wit.placemark.R


class MainApp : Application(), AnkoLogger {


  lateinit var placemarks: PlacemarkStore

  override fun onCreate() {
    super.onCreate()
    placemarks = PlacemarkJSONStore(applicationContext)
    info("Placemark Application started")

  }
}
