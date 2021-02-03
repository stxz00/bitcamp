set serveroutput on;
--
declare
	num number :=0;
begin
 loop
	dbms_output.put_line('run...');
	--exit when num :=5;
	if num=5 then
	exit;
	end if;
	num :=num+1; 
 end loop;
end;
/