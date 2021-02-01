select 
case when length(sub)<=5 then sub
    when length(sub)>5 then concat(substr(sub,1,5), '...')
    end sub
from bbs05;

set serveroutput on;

