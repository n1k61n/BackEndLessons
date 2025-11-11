package org.example
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val apiKey = "7dfb6123af93d0e82d27dd53f48e4b2b"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityEditText = findViewById<EditText>(R.id.cityEditText)
        val getWeatherBtn = findViewById<Button>(R.id.getWeatherBtn)
        val weatherTextView = findViewById<TextView>(R.id.weatherTextView)

        getWeatherBtn.setOnClickListener {
            val city = cityEditText.text.toString()
            if (city.isNotEmpty()) {
                RetrofitClient.instance.getWeather(city, apiKey)
                    .enqueue(object : Callback<WeatherResponse> {
                        override fun onResponse(
                            call: Call<WeatherResponse>,
                            response: Response<WeatherResponse>
                        ) {
                            if (response.isSuccessful && response.body() != null) {
                                val weather = response.body()!!
                                val info = "City: ${weather.name}\n" +
                                        "Temp: ${weather.main.temp}°C\n" +
                                        "Humidity: ${weather.main.humidity}%\n" +
                                        "Condition: ${weather.weather[0].description}"
                                weatherTextView.text = info
                            } else {
                                weatherTextView.text = "City not found"
                            }
                        }

                        override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                            weatherTextView.text = "Error: ${t.message}"
                        }
                    })
            }
        }
    }
}
