drop table lieu;
-- insert into  lieu values ('34172','MONTPELLIER',3.876716,43.610769,'34');

create table lieu(
	codeInsee varchar(5), 
	nomCom varchar(20),
	longitude float,
	latitude float,
	departements varchar(20),
	constraint pk_lieu primary key (codeInsee)
    constraint fk_lieu foreign key (departements) references departement (dep)

);


                                     
drop table departement;

-- insert into departement values ('01','AIN','01053'); 

create table departement(
	dep varchar(5),
	nomDep varchar(20),
	numReg number, 
    cheflieude varchar(20),
	constraint pk_departement primary key (dep),
    constraint fk_departement foreign key (cheflieude) references lieu (codeInsee)

);




drop table monument;
--insert into monument values ('spfb05ty554b','HOTEL DUFFAU','PRIVE','HOTEL_PARTICULIER',3.87521667,43.6140222,'34172');      

create table monument(
    codeM varchar(12),
	nomM varchar(12), 
	propietaire varchar(10),
	typeMonument varchar(16),
	longitude float,
	latitude float,
	--associeAcelebrites varchar(20),
    localisation varchar(20),

	constraint pk_monument primary key (codeM),
    constraint fk_monument foreign key (localisation) references lieu (codeInsee)
);

drop table celebrite;

create table celebrite(
    numCelebrite number,
    nom varchar(5),
	prenom varchar(5),
	nationalite varchar(5),
	epoque varchar(5)

);
  

-- est ce qu'on doit créer la table associé à ?

