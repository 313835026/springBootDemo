package com.wsdll.lvmm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LvmmController {


    @RequestMapping(value = "/lvmamacallback/asynnoticecallback.do",method = RequestMethod.POST)
    @ResponseBody
    public LvmamaCommonResponse order(@RequestBody OrderCreateNoticeRequest orderCreateNoticeRequest) {

        LvmamaCommonResponse lvmamaCommonResponse = new LvmamaCommonResponse();

        lvmamaCommonResponse.setStatus("0");

        return lvmamaCommonResponse;

    }

    @RequestMapping(value = "/lvmamacallback/usedticketscallback.do",method = RequestMethod.POST)
    @ResponseBody
    public LvmamaCommonResponse check(@RequestBody OrderCreateNoticeRequest orderCreateNoticeRequest) {

        LvmamaCommonResponse lvmamaCommonResponse = new LvmamaCommonResponse();

        lvmamaCommonResponse.setStatus("0");

        return lvmamaCommonResponse;

    }

    @RequestMapping(value = "/lvmamacallback/discardcodecallback.do",method = RequestMethod.POST)
    @ResponseBody
    public LvmamaCommonResponse refund(@RequestBody OrderCreateNoticeRequest orderCreateNoticeRequest) {

        LvmamaCommonResponse lvmamaCommonResponse = new LvmamaCommonResponse();

        lvmamaCommonResponse.setStatus("0");

        return lvmamaCommonResponse;

    }


}
