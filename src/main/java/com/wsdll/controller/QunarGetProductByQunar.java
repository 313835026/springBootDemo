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

        String str = "{\"data\":\"PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHJlc3BvbnNlIHhzaTpzY2hlbWFMb2NhdGlvbj0iaHR0cDovL3BpYW8ucXVuYXIuY29tLzIwMTMvUU1lbnBpYW9SZXNwb25zZVNjaGVtYSBRTVJlc3BvbnNlRGF0YVNjaGVtYS0yLjAuMS54c2QiIHhtbG5zPSJodHRwOi8vcGlhby5xdW5hci5jb20vMjAxMy9RTWVucGlhb1Jlc3BvbnNlU2NoZW1hIiB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIj4KCTxoZWFkZXI+CgkJPGFwcGxpY2F0aW9uPlF1bmFyLk1lbnBpYW8uQWdlbnQ8L2FwcGxpY2F0aW9uPgoJCTxwcm9jZXNzb3I+U3VwcGxpZXJEYXRhRXhjaGFuZ2VQcm9jZXNzb3I8L3Byb2Nlc3Nvcj4KCQk8dmVyc2lvbj52Mi4xLjU8L3ZlcnNpb24+CgkJPGJvZHlUeXBlPkdldFByb2R1Y3RCeVF1bmFyUmVzcG9uc2VCb2R5PC9ib2R5VHlwZT4KCQk8Y3JlYXRlVXNlcj5kYWxpYW5mb3Jlc3R6b28yPC9jcmVhdGVVc2VyPgoJCTxjcmVhdGVUaW1lPjIwMTgtMTEtMTIgMTQ6MTg6MzM8L2NyZWF0ZVRpbWU+CgkJPGNvZGU+MTAwMDwvY29kZT4KCQk8ZGVzY3JpYmU+5oiQ5YqfPC9kZXNjcmliZT4KCTwvaGVhZGVyPgoJPGJvZHkgeHNpOnR5cGU9IkdldFByb2R1Y3RCeVF1bmFyUmVzcG9uc2VCb2R5Ij4KCQk8Y291bnQ+MTwvY291bnQ+CgkJPHByb2R1Y3RJbmZvcz4KCQkJCTxwcm9kdWN0SW5mbz4KCQkJCQk8YmFzZUluZm8+CgkJCQkJCTxyZXNvdXJjZUlkPkZYUU5PTkVTMDE8L3Jlc291cmNlSWQ+CgkJCQkJCTxzaWdodHM+CgkJCQkJCQk8c2lnaHQ+CgkJCQkJCQkJPHNpZ2h0TmFtZT7ljrvlk6rlhL/liIbplIDmtYvor5XkuIDnpajkuIDkurpTMDE8L3NpZ2h0TmFtZT4KCQkJCQkJCQk8c2lnaHRBZGRyZXNzPuaZr+WMuuWcsOWdgDwvc2lnaHRBZGRyZXNzPgoJCQkJCQkJCTxjaXR5PuebrueahOWcsDwvY2l0eT4KCQkJCQkJCQk8c2lnaHRsb24+5pmv54K557uP5bqmPC9zaWdodGxvbj4KCQkJCQkJCQk8c2lnaHRsYXQ+5pmv54K557u05bqmPC9zaWdodGxhdD4KCQkJCQkJCTwvc2lnaHQ+CgkJCQkJCTwvc2lnaHRzPgoJCQkJCQk8cHJvZHVjdE5hbWU+RlhRTk9ORVMwMeWOu+WTquWEv+WIhumUgOa1i+ivleS4gOelqOS4gOS6ulMwMTwvcHJvZHVjdE5hbWU+CgkJCQkJPC9iYXNlSW5mbz4KCQkJCQk8Ym9va0NvbmZpZz4KCQkJCQkJPHBheW1lbnRUeXBlPlBSRVBBWTwvcGF5bWVudFR5cGU+CgkJCQkJCTxhZHZhbmNlT3B0aW9uPgoJCQkJCQkJPGJvb2tBZHZhbmNlRGF5PjwvYm9va0FkdmFuY2VEYXk+CgkJCQkJCQk8Ym9va0FkdmFuY2VUaW1lPjwvYm9va0FkdmFuY2VUaW1lPgoJCQkJCQkJPHVzZUFkdmFuY2VIb3VyPjwvdXNlQWR2YW5jZUhvdXI+CgkJCQkJCTwvYWR2YW5jZU9wdGlvbj4KCQkJCQkJPGF1dG9DYW5jZWxUaW1lPjwvYXV0b0NhbmNlbFRpbWU+CgkJCQkJCTxjb250YWN0UGVyc29uUmVxdWlyZWQ+CgkJCQkJCQk8bmFtZVJlcXVpcmVkPjwvbmFtZVJlcXVpcmVkPgoJCQkJCQkJPG5hbWVQaW55aW5SZXF1aXJlZD48L25hbWVQaW55aW5SZXF1aXJlZD4KCQkJCQkJCTxlbWFpbFJlcXVpcmVkPjwvZW1haWxSZXF1aXJlZD4KCQkJCQkJCTxhZGRyZXNzUmVxdWlyZWQ+PC9hZGRyZXNzUmVxdWlyZWQ+CgkJCQkJCTwvY29udGFjdFBlcnNvblJlcXVpcmVkPgoJCQkJCQk8Ym9va1BlcnNvblR5cGU+PC9ib29rUGVyc29uVHlwZT4KCQkJCQkJPHZpc2l0UGVyc29uUmVxdWlyZWRGb3JRdWFudGl0eT48L3Zpc2l0UGVyc29uUmVxdWlyZWRGb3JRdWFudGl0eT4KCQkJCQkJPHZpc2l0UGVyc29uUmVxdWlyZWQ+CgkJCQkJCQk8bmFtZVJlcXVpcmVkPjwvbmFtZVJlcXVpcmVkPgoJCQkJCQkJPG5hbWVQaW5ZaW5SZXF1aXJlZD48L25hbWVQaW5ZaW5SZXF1aXJlZD4KCQkJCQkJCTxjcmVkZW50aWFsc1JlcXVpcmVkPjwvY3JlZGVudGlhbHNSZXF1aXJlZD4KCQkJCQkJCTxjcmVkZW50aWFsc1JlcXVpcmVkVHlwZXM+PC9jcmVkZW50aWFsc1JlcXVpcmVkVHlwZXM+CgkJCQkJCQk8dXNlclJlcXVpcmVkRGVmaW5lZDE+PC91c2VyUmVxdWlyZWREZWZpbmVkMT4KCQkJCQkJCTx1c2VyUmVxdWlyZWREZWZpbmVkMj48L3VzZXJSZXF1aXJlZERlZmluZWQyPgoJCQkJCQk8L3Zpc2l0UGVyc29uUmVxdWlyZWQ+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxoYXNNYXhNb2JpbGVMaW1pdD48L2hhc01heE1vYmlsZUxpbWl0PgogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8bW9iaWxlTGltaXRUaW1lU2NvcGU+PC9tb2JpbGVMaW1pdFRpbWVTY29wZT4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPG1vYmlsZUxpbWl0VW5pdD48L21vYmlsZUxpbWl0VW5pdD4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPG1heE1vYmlsZUxpbWl0PjwvbWF4TW9iaWxlTGltaXQ+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxoYXNNYXhJRENhcmRMaW1pdD48L2hhc01heElEQ2FyZExpbWl0PgogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8aWRDYXJkTGltaXRUaW1lU2NvcGU+PC9pZENhcmRMaW1pdFRpbWVTY29wZT4gCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxpZENhcmRMaW1pdFVuaXQ+PC9pZENhcmRMaW1pdFVuaXQ+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxtYXhJRENhcmRMaW1pdD48L21heElEQ2FyZExpbWl0PiAgICAgICAgICAgICAgICAgICAgICAgCgkJCQkJPC9ib29rQ29uZmlnPgoJCQkJCTxwcmljZUNvbmZpZz4KCQkJCQkJPHZhbGlkVHlwZT5CRVRXRUVOX1VTRV9EQVRFX1NUQVJUX0FORF9FTkQ8L3ZhbGlkVHlwZT4KCQkJCQkJPGRheXNBZnRlclVzZURhdGVWYWxpZD48L2RheXNBZnRlclVzZURhdGVWYWxpZD4KCQkJCQkJPGRheXNBZnRlckJvb2tEYXRlVmFsaWQ+PC9kYXlzQWZ0ZXJCb29rRGF0ZVZhbGlkPgoJCQkJCQk8ZGF5VXNlVGltZVBlcmlvZD4wMDowMC0yMzo1OTwvZGF5VXNlVGltZVBlcmlvZD4JCQkJCQkKCQkJCQkJPGNhbGVuZGFyUHJpY2VzPgoJCQkJCQkJPGNhbGVuZGFyUHJpY2U+CgkJCQkJCQkJPHVzZURhdGU+PC91c2VEYXRlPgoJCQkJCQkJCTxtYXJrZXRQcmljZT48L21hcmtldFByaWNlPgoJCQkJCQkJCTxzZWxsUHJpY2U+MTAxMDA8L3NlbGxQcmljZT4KCQkJCQkJCQk8c2VsbHN0b2NrPjEwMTAwMDwvc2VsbHN0b2NrPgoJCQkJCQkJCTxtaW5pbXVtPjE8L21pbmltdW0+CgkJCQkJCQkJPG1heGltdW0+OTk5OTk8L21heGltdW0+CgkJCQkJCQk8L2NhbGVuZGFyUHJpY2U+CgkJCQkJCTwvY2FsZW5kYXJQcmljZXM+CgkJCQkJCTxwZXJpb2RQcmljZT4KCQkJCQkJCTxwZXJpb2RTdGFydD4yMDAwLTAxLTAxPC9wZXJpb2RTdGFydD4KCQkJCQkJCTxwZXJpb2RFbmQ+MjA0OS0wMS0wMTwvcGVyaW9kRW5kPgoJCQkJCQkJPHZhbGlkV2Vlaz48L3ZhbGlkV2Vlaz4KCQkJCQkJCTxpbnZhbGlkRGF0ZT48L2ludmFsaWREYXRlPgoJCQkJCQkJPG1hcmtldFByaWNlPjE1MDAwPC9tYXJrZXRQcmljZT4KCQkJCQkJCTxzZWxsUHJpY2U+MTMxMDA8L3NlbGxQcmljZT4KCQkJCQkJCTxzZWxsc3RvY2s+MTAxMDAwPC9zZWxsc3RvY2s+CgkJCQkJCQk8bWluaW11bT4xPC9taW5pbXVtPgoJCQkJCQkJPG1heGltdW0+OTk5OTk8L21heGltdW0+CgkJCQkJCTwvcGVyaW9kUHJpY2U+CgkJCQkJPC9wcmljZUNvbmZpZz4KCQkJCQk8cHJvbW90ZUNvbmZpZz4KCQkJCQkJPGNhc2hCYWNrTW9uZXk+PC9jYXNoQmFja01vbmV5PgoJCQkJCTwvcHJvbW90ZUNvbmZpZz4KCQkJCQk8cHJvZHVjdERlc2NyaXB0aW9uPgoJCQkJCQk8ZmVlSW5mbz7otLnnlKjor7TmmI48L2ZlZUluZm8+CgkJCQkJCTxmZWVJbmNsdWRlPui0ueeUqOWMheWQqzwvZmVlSW5jbHVkZT4KCQkJCQkJPGZlZUV4Y2x1ZGU+6LS555So5LiN5YyF5ZCrPC9mZWVFeGNsdWRlPgoJCQkJCQk8cGlja3VwVGltZT7lj5bnpajml7bpl7Q8L3BpY2t1cFRpbWU+CgkJCQkJCTxwaWNrdXBBZGRyZXNzPuWPluelqOWcsOeCuTwvcGlja3VwQWRkcmVzcz4KCQkJCQkJPHJlbWluZD7kvb/nlKjor7TmmI48L3JlbWluZD4KCQkJCQkJPHJlZnVuZE9wdGlvbj4KCQkJCQkJCTxjYW5SZWZ1bmQ+VFJVRTwvY2FuUmVmdW5kPgoJCQkJCQkJPHN1cHBvcnRQYXJ0UmVmdW5kPlRSVUU8L3N1cHBvcnRQYXJ0UmVmdW5kPgoJCQkJCQkJPHJlZnVuZEFwcGx5VGltZUJlZm9yZVZhbGlkRW5kRGF5PjFfMjI6MDA8L3JlZnVuZEFwcGx5VGltZUJlZm9yZVZhbGlkRW5kRGF5PgoJCQkJCQkJPHJlZnVuZENoYXJnZVR5cGU+T1JERVI8L3JlZnVuZENoYXJnZVR5cGU+CgkJCQkJCQk8cmVmdW5kQ2hhcmdlPjEwMDwvcmVmdW5kQ2hhcmdlPgoJCQkJCQkJPHJlZnVuZEluZm8+6YCA5qy+6KeE5YiZPC9yZWZ1bmRJbmZvPgoJCQkJCQk8L3JlZnVuZE9wdGlvbj4KCQkJCQk8L3Byb2R1Y3REZXNjcmlwdGlvbj4KCQkJCQk8b3RoZXJDb25maWc+CgkJCQkJCTx0ZWxlcGhvbmU+NDAwODg4OTk1NTQ8L3RlbGVwaG9uZT4KCQkJCQkJPHNhbGVQZXJpb2RzPgoJCQkJCQkJPHNhbGVQZXJpb2Q+CgkJCQkJCQkJPHNhbGVTdGFydFRpbWU+PC9zYWxlU3RhcnRUaW1lPgoJCQkJCQkJCTxzYWxlRW5kVGltZT48L3NhbGVFbmRUaW1lPgoJCQkJCQkJPC9zYWxlUGVyaW9kPgoJCQkJCQk8L3NhbGVQZXJpb2RzPgoJCQkJCQk8ZXRpY2tldFR5cGU+Tk9fQ09ERTwvZXRpY2tldFR5cGU+CgkJCQkJPC9vdGhlckNvbmZpZz4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPGVudGVyUGFya0NvbmZpZz4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxwYXNzRXhjaGFuZ2VWb3VjaGVyVHlwZT48L3Bhc3NFeGNoYW5nZVZvdWNoZXJUeXBlPgogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPHVzZXJOYW1lVm91Y2hlcj48L3VzZXJOYW1lVm91Y2hlcj4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxtb2JpbGVWb3VjaGVyPjwvbW9iaWxlVm91Y2hlcj4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxpZENhcmRWb3VjaGVyPjwvaWRDYXJkVm91Y2hlcj4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxzZW5kVm91Y2hlclRpbWVUeXBlPjwvc2VuZFZvdWNoZXJUaW1lVHlwZT4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxpc05lZWRTZXJ2aWNlVGltZT48L2lzTmVlZFNlcnZpY2VUaW1lPgogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPGRlbGF5U2VuZFZvdWNoZXJNaW51dGVzPjwvZGVsYXlTZW5kVm91Y2hlck1pbnV0ZXM+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8Zmlyc3ROZWVkU2VydmljZVRpbWU+PC9maXJzdE5lZWRTZXJ2aWNlVGltZT4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxzZWNvbmROZWVkU2VydmljZVRpbWU+PC9zZWNvbmROZWVkU2VydmljZVRpbWU+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8dGhpcmROZWVkU2VydmljZVRpbWU+PC90aGlyZE5lZWRTZXJ2aWNlVGltZT4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxjdXN0b21TZW5kVm91Y2hlclRpbWU+PC9jdXN0b21TZW5kVm91Y2hlclRpbWU+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8aXNTdXBwb3J0RXhwcmVzcz48L2lzU3VwcG9ydEV4cHJlc3M+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8aXNTdXBwb3J0VGFrZT48L2lzU3VwcG9ydFRha2U+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICA8cGFzc1R5cGU+PC9wYXNzVHlwZT4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxleGNoYW5nZUFkZHJlc3NMaXN0PjwvZXhjaGFuZ2VBZGRyZXNzTGlzdD4KICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxwYXNzQWRkcmVzc0xpc3Q+PC9wYXNzQWRkcmVzc0xpc3Q+CiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDwvZW50ZXJQYXJrQ29uZmlnPgoJCQkJPC9wcm9kdWN0SW5mbz4KCQk8L3Byb2R1Y3RJbmZvcz4KCTwvYm9keT4KPC9yZXNwb25zZT4=\",\"securityType\":\"MD5\",\"signed\":\"521A7FACA479DB637CDD3271C96F652C\"}";
        System.out.println(str);
        return str;
    }
}
