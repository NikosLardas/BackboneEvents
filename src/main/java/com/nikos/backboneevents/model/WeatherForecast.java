package com.nikos.backboneevents.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class WeatherForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Define through API

    // Conversion from unix time to localdate
    // https://mkyong.com/java8/java-8-convert-epoch-time-milliseconds-to-localdate-or-localdatetime/

    // This is what I want to have
//       "list":[
//            {
//            "dt":1594382400,
//            "temp":{
//                "min":285.22,
//                "max":287.97
//             },
//            "weather":[
//              {
//                "main":"Rain",
//                "description":"light rain"
//               }
//                      ]
//             }
//         ]
}
