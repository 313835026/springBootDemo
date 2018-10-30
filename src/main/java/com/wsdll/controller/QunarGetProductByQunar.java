package com.wsdll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 模拟去哪儿网接受请求获取产品信息
 * @author: WH
 * @create: 2018-10-26 11:07
 **/
@RestController
@RequestMapping(value = "/qunaer")
public class QunarGetProductByQunar {

    @RequestMapping(value = "/entry")
    public String entry(HttpServletRequest request) {
        System.out.println(request.getParameter("method"));
        System.out.println(request.getParameter("requestParam"));

        String str = "{\"data\":\"PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8cmVzcG9uc2UgeG1sbnM9Imh0dHA6Ly9waWFvLnF1bmFyLmNvbS8yMDEzL1FNZW5waWFvUmVzcG9uc2VTY2hlbWEiPgogICAgPGhlYWRlcj4KICAgICAgICA8YXBwbGljYXRpb24+UXVuYXIuTWVucGlhby5BZ2VudDwvYXBwbGljYXRpb24+CiAgICAgICAgPHByb2Nlc3Nvcj5TdXBwbGllckRhdGFFeGNoYW5nZVByb2Nlc3NvcjwvcHJvY2Vzc29yPgogICAgICAgIDx2ZXJzaW9uPnYyLjAuMTwvdmVyc2lvbj4KICAgICAgICA8Ym9keVR5cGU+Q3JlYXRlT3JkZXJGb3JCZWZvcmVQYXlTeW5jUmVzcG9uc2VCb2R5PC9ib2R5VHlwZT4KICAgICAgICA8Y3JlYXRlVXNlcj5kYWxpYW5mb3Jlc3R6b288L2NyZWF0ZVVzZXI+CiAgICAgICAgPGNyZWF0ZVRpbWU+MjAxOC0xMC0yNiAxMzo0NDoyOS4yOTI8L2NyZWF0ZVRpbWU+CiAgICAgICAgPGNvZGU+MTAwMDwvY29kZT4KICAgICAgICA8ZGVzY3JpYmU+5oiQ5YqfPC9kZXNjcmliZT4KICAgIDwvaGVhZGVyPgogICAgPGJvZHkgeHNpOnR5cGU9IkNyZWF0ZU9yZGVyRm9yQmVmb3JlUGF5U3luY1Jlc3BvbnNlQm9keSIgeG1sbnM6eHNpPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxL1hNTFNjaGVtYS1pbnN0YW5jZSI+CiAgICAgICAgPG9yZGVySW5mbz4KICAgICAgICAgICAgPHBhcnRuZXJvcmRlcklkPjEwNTU2OTY2NDc3MDQ1NDMyMzQ8L3BhcnRuZXJvcmRlcklkPgogICAgICAgICAgICA8b3JkZXJTdGF0dXM+UFJFUEFZX09SREVSX05PVF9QQVlFRDwvb3JkZXJTdGF0dXM+CiAgICAgICAgPC9vcmRlckluZm8+CiAgICA8L2JvZHk+CjwvcmVzcG9uc2U+Cg==\",\"securityType\":\"MD5\",\"signed\":\"EC69CC062F1C056D74CE06164CCE483A\"}";
        System.out.println(str);
        return str;
    }
}
