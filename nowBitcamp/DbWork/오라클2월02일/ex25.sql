set serveroutput on;
--
declare
begin
	for cnt in 1..5 loop
		dbms_output.put_line('for run:'||cnt);
	end loop;
end;
/
st