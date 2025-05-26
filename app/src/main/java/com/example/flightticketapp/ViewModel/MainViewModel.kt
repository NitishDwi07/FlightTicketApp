package com.example.flightticketapp.ViewModel

import androidx.lifecycle.LiveData
import com.example.flightticketapp.Domain.FlightModel
import com.example.flightticketapp.Domain.LocationModel
import com.example.flightticketapp.Repository.MainRepository

class MainViewModel {
    private val repository= MainRepository()
    fun loadLocations(): LiveData<MutableList<LocationModel>>{
        return repository.loadLocation()
    }
    fun loadFiltered(from:String, to:String):
            LiveData<MutableList<FlightModel>>{
        return repository.loadFiltered(from,to)
    }
}