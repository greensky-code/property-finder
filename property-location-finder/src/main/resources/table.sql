CREATE TABLE IF NOT EXISTS core."property_data"
(
    prop_id character varying(100) NOT NULL,
    roomnumber character varying(100),
    square character varying(100),
	description character varying(100),
    image character varying(100),
	address character varying(100),
    CONSTRAINT "PROP_PK" PRIMARY KEY (prop_id)
	)
	
	
	select * from core."property_data";