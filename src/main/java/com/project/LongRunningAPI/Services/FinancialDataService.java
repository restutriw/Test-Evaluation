package com.project.LongRunningAPI.Services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
public class FinancialDataService {

    @Async
    public void processDataAsync(Long companyId) {
        try {
            // Simulasi untuk proses api yang butuh waktu > 5 menit
            Thread.sleep(300000);
            // Print ketika prosesnya sudah selesai
            System.out.println("The process has been completed for companyId: " + companyId);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
