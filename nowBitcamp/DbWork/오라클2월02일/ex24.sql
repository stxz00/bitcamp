set serveroutput on;
--
declare
	num integer :=1;
--반복문일때 인티져 사용 가능
begin
	while num<5 loop
		dbms_output.put_line('run...'||num);
		num :=num+1;
	end loop;
end;
/