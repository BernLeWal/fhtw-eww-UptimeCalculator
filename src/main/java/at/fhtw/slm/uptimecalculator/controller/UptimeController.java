package at.fhtw.slm.uptimecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;

@RestController
public class UptimeController {
    @GetMapping("/uptime/minutes")
    public double calculateUptimeMinutes(@RequestParam double relative) {
        if (relative< 0.0 || relative>100.0)
            throw new InvalidParameterException();

        double minutesOfMonth = 60*24*30;   // an approximation
        double definedUptimeInPercent = relative / 100;
        return minutesOfMonth * definedUptimeInPercent; // uptime in minutes
    }
}
