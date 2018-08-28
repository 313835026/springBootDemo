this is wsdll <br>
${name}<br>
${age}<br>

<#if sex == 1>
    男
<#elseif sex == 2>
    女
<#else>
    其他
</#if>

<br>

<#list numList as num>
    ${num}<br>
</#list>