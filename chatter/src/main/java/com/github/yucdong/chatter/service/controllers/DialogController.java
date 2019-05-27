package com.github.yucdong.chatter.service.controllers;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

import com.github.yucdong.chatter.contract.DialogRequest;
import com.github.yucdong.chatter.contract.DialogResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class DialogController {

    @RequestMapping(method = RequestMethod.POST, path = "/dialog")
    public DialogResponse runDialog(@RequestBody DialogRequest request) {
        String reply = String.format("您的请求是 %s", request.getQuery());
        DialogResponse resp = new DialogResponse(reply, "default");

        return resp;
    }
}
