set serveroutput on;
--
declare
	type arr_dname is table of dept.dname%type index by binary_integer;
	v_dnames arr_dname;
	v_dname dept.dname%type;
	i integer :=0;
begin
	select dname into v_dname from dept where deptno=10;
	v_dnames(0) :=v_dname;
	i :=i+1;
	select dname into v_dname from dept where deptno=20;
	v_dnames(1) :=v_dname;
	i :=i+1;
	select dname into v_dname from dept where deptno=30;
	v_dnames(2) :=v_dname;
	i :=i+1;
	select dname into v_dname from dept where deptno=40;
	v_dnames(3) :=v_dname;
	for cnt in reverse 0..i loop
	dbms_output.put_line(v_dnames(cnt));
	end loop;
end;
/