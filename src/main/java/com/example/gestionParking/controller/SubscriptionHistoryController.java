package com.example.gestionParking.controller;


import com.example.gestionParking.services.IGestionSubscriptionHistory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subHistory")
@AllArgsConstructor
public class SubscriptionHistoryController {
    IGestionSubscriptionHistory subhistoryService;
   // @PostMapping("/assignCours/{numI}/{numC}")
   /// public assignHistoryToSubscription(@PathVariable("numI") Long numInsc, @PathVariable("numC") Long numCours) {
        ///return inscService.assignInscriptionToCours(numInsc, numCours);
    }


