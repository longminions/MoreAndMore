package MoreAndMore.ForHalogen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping
    public ResponseEntity<List<String>> getData() {
        List<String> dataList = new ArrayList<String>();
        dataList.add("long");
        return ResponseEntity.ok(dataList);
    }
}