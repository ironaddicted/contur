<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<#import "/spring.ftl" as spring />
<html>

<form role="loginForm" action="/login" method="POST">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    Name:
    <input type="text"
           name="username"
           value="${message}" /><br>
    <input type="text"
           name="password"
           value="${message}" />
    <br/>
<#--<#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>-->
    <br>
    <input type="submit" value="submit"/>
</form>
</html>