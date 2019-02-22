package com.example.retreivefellow;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;

@Component
public class Loaders {

    @PostConstruct
//    @Transactional
    public void loadAll() {
        RestTemplate restTemplate = new RestTemplate();

        String fooResourceUrl = "http://localhost:9200/customers/_search?q=first_name=Akarsha";
        while (true) {
            ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
            System.out.println(response.getBody());

//			Type type = new TypeToken<Map<String, String>>(){}.getType();
//			Gson gson = new Gson();
//			Map<String, String> myMap = gson.fromJson(response.getBody(), type);

//			if (){
            System.out.println(new Timestamp(System.currentTimeMillis()));

//                break;
        }


    }
}
