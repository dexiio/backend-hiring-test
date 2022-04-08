package io.dexi.pizzeria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {


    public ManagementController() {
            }

    @GetMapping("/manage/statistic/purchases")
    public long getPurchasesCount() {
        // TO DO
        /**
         * return the the number of purchases submitted
         */
        return -1;

    }
}
