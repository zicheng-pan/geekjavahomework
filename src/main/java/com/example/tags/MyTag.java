package com.example.tags;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport {

    private String cacheControl;
    private String pragma;
    private Long expires;

    @Override
    public void doTag() {
        HttpServletResponse response = (HttpServletResponse) ((PageContext) getJspContext()).getResponse();
        response.setHeader("Cache-Control", cacheControl);
        response.setHeader("Pragma", pragma);
        response.setDateHeader("Expires", expires);
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getPragma() {
        return pragma;
    }

    public void setPragma(String pragma) {
        this.pragma = pragma;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }
}
