package com.xoriant.form_report_server.controller;

import com.xoriant.form_report_server.model.Req;
import com.xoriant.form_report_server.service.ReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reqs")
@CrossOrigin(origins = "https://form-report-client.vercel.app") // Allow Angular frontend (update URL if needed)
public class ReqController {

    @Autowired
    private ReqService reqService;

    // POST request to save a new Req
    @PostMapping
    public Req saveReq(@RequestBody Req req) {
        System.out.println("Received req_id: " + req.getReqId()); // Debugging log
        return reqService.saveReq(req);
    }

    // GET request to fetch all Reqs
    @GetMapping
    public List<Req> getAllReqs() {
        return reqService.getAllReqs();
    }

    // PUT request to update an existing Req
    @PutMapping("/{id}")
    public Req updateReq(@PathVariable String id, @RequestBody Req updatedReq) {
        return reqService.updateReq(id, updatedReq);
    }

    // DELETE request to remove a Req by ID
    @DeleteMapping("/{id}")
    public String deleteReq(@PathVariable String id) {
        return reqService.deleteReq(id);
    }
}
