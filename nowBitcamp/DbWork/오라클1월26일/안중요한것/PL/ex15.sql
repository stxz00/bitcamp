declare
	--변수 선언부
	num1 number;
	num2 number(1);
	num3 number:=3333;
begin
	--실행문장
	num1:=1111;
	num2:=2;
	dbms_output.put_line(num1);
	dbms_output.put_line(num2);
	dbms_output.put_line(num3);
end;
/