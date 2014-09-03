create table Intranet_Satff (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	user_id LONG,
	city VARCHAR(75) null,
	name VARCHAR(75) null,
	turnover_time DATE null,
	entry_time DATE null,
	base_pay DOUBLE,
	performance_pay DOUBLE,
	wage_subtotal DOUBLE,
	insurance_base DOUBLE,
	endowment_insurance DOUBLE,
	unemployment_insurance DOUBLE,
	work_injury_insurance DOUBLE,
	birth_insurance DOUBLE,
	medical_insurance DOUBLE,
	individual_insurance DOUBLE,
	housing_accumulation_fund_base DOUBLE,
	individual_pay DOUBLE,
	amount_payable DOUBLE,
	people_together DOUBLE,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table Intranet_basic_information (
	uuid_ VARCHAR(75) null,
	staffId LONG not null primary key,
	userId LONG,
	name VARCHAR(75) null,
	sex VARCHAR(75) null,
	id_number VARCHAR(75) null,
	nation VARCHAR(75) null,
	place_of_origin VARCHAR(75) null,
	account_properties VARCHAR(75) null,
	birth DATE null,
	marital_status VARCHAR(75) null,
	highest_degree VARCHAR(75) null,
	political_background VARCHAR(75) null,
	file_location VARCHAR(75) null,
	base_pay DOUBLE,
	performance_pay DOUBLE,
	health VARCHAR(75) null,
	contact_phone VARCHAR(75) null,
	mail VARCHAR(75) null,
	domicile VARCHAR(75) null,
	residence_phone VARCHAR(75) null,
	current_residential_address VARCHAR(75) null,
	current_residential_address_phone VARCHAR(75) null,
	emergency_contact VARCHAR(75) null,
	emergency_contact_relation VARCHAR(75) null,
	emergency_contact_phone VARCHAR(75) null,
	companyId LONG,
	createuser LONG,
	createDate DATE null,
	modifieduser LONG,
	modifiedDate DATE null
);

create table Intranet_education (
	uuid_ VARCHAR(75) null,
	educationId LONG not null primary key,
	satffId LONG,
	witness VARCHAR(75) null,
	professional VARCHAR(75) null,
	university VARCHAR(75) null,
	contact_phone VARCHAR(75) null,
	start_stop_time DATE null,
	companyId LONG,
	createuser LONG,
	createDate DATE null,
	modifieduser LONG,
	modifiedDate DATE null
);

create table Intranet_ext_information (
	uuid_ VARCHAR(75) null,
	extId LONG not null primary key,
	staffId LONG,
	open_city VARCHAR(75) null,
	bank_name VARCHAR(75) null,
	bankid VARCHAR(75) null,
	labor_contract_start DATE null,
	labor_contract_end DATE null,
	probation_period_start DATE null,
	probation_period_end DATE null,
	indured_location VARCHAR(75) null,
	frist_insured DATE null,
	is_insured VARCHAR(75) null,
	companyId LONG,
	createuser LONG,
	createDate DATE null,
	modifieduser LONG,
	modifiedDate DATE null
);

create table Intranet_family (
	uuid_ VARCHAR(75) null,
	familyId LONG not null primary key,
	satffId LONG,
	name VARCHAR(75) null,
	relationship VARCHAR(75) null,
	work_unit VARCHAR(75) null,
	contact_phone VARCHAR(75) null,
	once_job VARCHAR(75) null,
	companyId LONG,
	createuser LONG,
	createDate DATE null,
	modifieduser LONG,
	modifiedDate DATE null
);

create table Intranet_satff (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	user_id LONG,
	city VARCHAR(75) null,
	name VARCHAR(75) null,
	base_pay DOUBLE,
	performance_pay DOUBLE,
	wage_subtotal DOUBLE,
	insurance_base DOUBLE,
	endowment_insurance DOUBLE,
	unemployment_insurance DOUBLE,
	work_injury_insurance DOUBLE,
	birth_insurance DOUBLE,
	medical_insurance DOUBLE,
	individual_insurance DOUBLE,
	housing_accumulation_fund_base DOUBLE,
	individual_pay DOUBLE,
	amount_payable DOUBLE,
	people_together DOUBLE,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table Intranet_work (
	uuid_ VARCHAR(75) null,
	workId LONG not null primary key,
	satffId LONG,
	witness VARCHAR(75) null,
	once_job VARCHAR(75) null,
	work_unit VARCHAR(75) null,
	contact_phone VARCHAR(75) null,
	start_stop_time DATE null,
	companyId LONG,
	createuser LONG,
	createDate DATE null,
	modifieduser LONG,
	modifiedDate DATE null
);