package com.xoriant.form_report_server.service;

import com.xoriant.form_report_server.model.Req;
import com.xoriant.form_report_server.repository.ReqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReqService {

    @Autowired
    private ReqRepository reqRepository;

    public Req saveReq(Req req) {
        return reqRepository.save(req); // MongoDB auto-generates _id if missing
    }

    public List<Req> getAllReqs() {
        return reqRepository.findAll();
    }

    public Req updateReq(String id, Req updatedReq) {
        Optional<Req> existingReq = reqRepository.findById(id);
        if (existingReq.isPresent()) {
            updatedReq.setReqId(id); // Ensure the same ID is used
            return reqRepository.save(updatedReq);
        } else {
            throw new RuntimeException("Req not found with ID: " + id);
        }
    }

    public String deleteReq(String id) {
        if (reqRepository.existsById(id)) {
            reqRepository.deleteById(id);
            return "Req deleted successfully with ID: " + id;
        } else {
            throw new RuntimeException("Req not found with ID: " + id);
        }
    }
}
