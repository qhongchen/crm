/**
 *
 */
package com.ftplatform.config;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   15:54
 */
public final class VersionInfo {

    //application info
    public final static String APP_NAME="客户关系管理系统";
    public final static String APP_VERSION="1.0";
    public final static String APP_STATUS="Beta";
    public final static String APP_BUILDATE="2017-07-20";
    public final static String APP_BUILDVER="#2";

    //application author
    public final static String APP_AUTHOR="qhong Chen";
    public final static String APP_WORKSTUDIO="20xx-20xx xxxxxxxxxxx ";

    public final static String buildFooterStr()
    {
        StringBuffer sb=new StringBuffer();

        sb.append(APP_NAME);
        sb.append(" "+"(版本:"+APP_STATUS+APP_VERSION);
        sb.append(" &nbsp;&nbsp;Build:"+APP_BUILDVER);
        sb.append(" "+APP_BUILDATE+")");
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;开发团队:&nbsp;<a href=''>"+APP_AUTHOR+"</a><br/>");
        sb.append("(C)&nbsp;"+APP_WORKSTUDIO+"&nbsp;&nbsp;");

        return sb.toString();
    }

}
