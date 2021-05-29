--users

INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (1, 'atascanturk@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (2, 'test2@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (3, 'test3@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (4, 'test4@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (5, 'test5@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (6, 'test6@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (7, 'test7@gmail.com', '12345', '12345');
	
	INSERT INTO public.users(
	id, email, password, password_again)
	VALUES (8, 'test8@gmail.com', '12345', '12345');
	
	
--user_types
	
	INSERT INTO public.user_types(
	id, user_type)
	VALUES (1, 'Employee');
	
	INSERT INTO public.user_types(
	id, user_type)
	VALUES (2, 'Employer');
	
	INSERT INTO public.user_types(
	id, user_type)
	VALUES (3, 'Admin');
	
--employers

INSERT INTO public.employers(
	id, company_name, web_address, phone_number, user_type_id, user_id)
	VALUES (1, 'Ibtech', 'www.ibtech.com', '1234567892', 2, 2);
	
	INSERT INTO public.employers(
	id, company_name, web_address, phone_number, user_type_id, user_id)
	VALUES (2, 'Arcelik', 'www.arcelik.com', '12345678921', 2, 3);
	
--employee

INSERT INTO public.employees(
	id, first_name, last_name, identity_number, date_of_birth, user_type_id, user_id)
	VALUES (1, 'Cantürk', 'Ataş', '12345678909', '03/11/1994', 1, 1);
	
--admin_users

INSERT INTO public.admin_users(
	id, first_name, last_name, user_type_id, user_id)
	VALUES (1, 'Admin', 'Admin', 3, 4);
	
	INSERT INTO public.admin_users(
	id, first_name, last_name, user_type_id, user_id)
	VALUES (2, 'Super Admin', 'Admin', 3, 5);
	
--cities

INSERT INTO public.cities(
	id, name)
	VALUES (1, 'İstanbul');
	
	INSERT INTO public.cities(
	id, name)
	VALUES (2, 'İzmir');
	
--user_activations

INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (1, '1020as-DASa12121',true,'29/05/2021',1 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (2, '1020as-DASa12121',true,'29/05/2021',2 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (3, '1020as-DASa12121',true,'29/05/2021',3 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (4, '1020as-DASa12121',true,'29/05/2021',4 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (5, '1020as-DASa12121',true,'29/05/2021',5 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (6, '1020as-DASa12121',true,'29/05/2021',6 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (7, '1020as-DASa12121',true,'29/05/2021',7 );
	
	INSERT INTO public.user_activations(
	id, activation_code, is_confirmed, confirmation_date, user_id)
	VALUES (8, '1020as-DASa12121',true,'29/05/2021',8 );
	
--user_activations_by_admin_users	

	INSERT INTO public.user_activations_by_admin_users(
	id, confirmed_employee_id, confirmation_date, is_confirmed)
	VALUES (1, 1, '29/05/2021', true);
	
-- job_titles
	
	INSERT INTO public.job_titles(
	id, title, city_id, min_salary, max_salary, open_position_count, created_date, application_deadline, is_active, employer_id)
	VALUES (1, 'Software Developer', '1', 8000,15000,2, '29/05/2021', '29/06/2021', true, 1);
	
	INSERT INTO public.job_titles(
	id, title, city_id, min_salary, max_salary, open_position_count, created_date, application_deadline, is_active, employer_id)
	VALUES (2, 'Software Architect', '2', 8000,15000,2,  '29/05/2021', '29/06/2021', true, 2);
	
	INSERT INTO public.job_titles(
	id, title, city_id, min_salary, max_salary, open_position_count, created_date, application_deadline, is_active, employer_id)
	VALUES (3, 'Business Analyst', '2', 8000,15000,2,  '29/05/2021', '29/06/2021', true, 2);
	