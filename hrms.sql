SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16964)
-- Name: abilities; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.abilities (
    id integer NOT NULL,
    job_hunter_id integer,
    name character varying(20)
);


ALTER TABLE public.abilities OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 17015)
-- Name: abilities_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.abilities ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.abilities_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 212 (class 1259 OID 16894)
-- Name: cities; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cities (
    id integer NOT NULL,
    city character varying(255) NOT NULL
);


ALTER TABLE public.cities OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 17002)
-- Name: cv_cover_letter; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cv_cover_letter (
    id integer NOT NULL,
    job_hunter_id integer,
    content character varying
);


ALTER TABLE public.cv_cover_letter OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 17017)
-- Name: cv_cover_letter_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.cv_cover_letter ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.cv_cover_letter_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 213 (class 1259 OID 16944)
-- Name: educations; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.educations (
    id integer NOT NULL,
    school character varying(40),
    department character varying(35),
    job_hunter_id integer,
    start_date date,
    graduation_date date
);


ALTER TABLE public.educations OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 17019)
-- Name: educations_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.educations ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.educations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 202 (class 1259 OID 16570)
-- Name: employees; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employees (
    user_id integer NOT NULL,
    first_name character varying(10) NOT NULL,
    last_name character varying(10) NOT NULL
);


ALTER TABLE public.employees OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16567)
-- Name: employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employers (
    user_id integer NOT NULL,
    website character varying(30) NOT NULL,
    phone_number integer NOT NULL,
    company_name character varying(30) NOT NULL,
    is_activated boolean
);


ALTER TABLE public.employers OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16954)
-- Name: experiences; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.experiences (
    id integer NOT NULL,
    job_hunter_id integer,
    firm_name character varying(20),
    "position" character varying(20),
    start_date date,
    leave_date date
);


ALTER TABLE public.experiences OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 17021)
-- Name: experiences_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.experiences ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.experiences_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 207 (class 1259 OID 16627)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16994)
-- Name: images; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.images (
    id integer NOT NULL,
    job_hunter_id integer,
    url character varying,
    update_date date
);


ALTER TABLE public.images OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 17023)
-- Name: images_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.images ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.images_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 211 (class 1259 OID 16889)
-- Name: job_advertisements; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_advertisements (
    id integer NOT NULL,
    requirements character varying(150),
    city_id integer,
    open_positions integer,
    application_date date,
    application_deadline date,
    is_active boolean,
    employer_id integer,
    position_id integer,
    salary integer,
    name character varying(50)
);


ALTER TABLE public.job_advertisements OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16579)
-- Name: job_hunters; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_hunters (
    user_id integer NOT NULL,
    first_name character varying(20) NOT NULL,
    last_name character varying(20) NOT NULL,
    birth_date integer NOT NULL,
    national_identity character varying(11) NOT NULL,
    is_activated boolean
);


ALTER TABLE public.job_hunters OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16582)
-- Name: jobs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jobs (
    id integer NOT NULL,
    name character varying(20) NOT NULL
);


ALTER TABLE public.jobs OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16589)
-- Name: jobs_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.jobs ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.jobs_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 216 (class 1259 OID 16974)
-- Name: languages; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.languages (
    id integer NOT NULL,
    job_hunter_id integer,
    level integer,
    language character varying(20)
);


ALTER TABLE public.languages OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 17025)
-- Name: languages_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.languages ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.languages_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 217 (class 1259 OID 16984)
-- Name: links; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.links (
    id integer NOT NULL,
    job_hunter_id integer,
    url character varying(30),
    name character varying(20)
);


ALTER TABLE public.links OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 17027)
-- Name: links_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.links ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.links_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 200 (class 1259 OID 16564)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    user_id integer NOT NULL,
    password character varying(20) NOT NULL,
    email character varying(20) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16587)
-- Name: users_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.users ALTER COLUMN user_id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.users_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 210 (class 1259 OID 16874)
-- Name: verification_by_employees; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_by_employees (
    id integer NOT NULL,
    employer_id integer,
    employee_id integer,
    confirm_date date
);


ALTER TABLE public.verification_by_employees OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16759)
-- Name: verification_codes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_codes (
    id integer NOT NULL,
    confirm_date date,
    verification_code character varying(255),
    user_id integer
);


ALTER TABLE public.verification_codes OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16762)
-- Name: verification_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.verification_codes ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.verification_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 2955 (class 2606 OID 16968)
-- Name: abilities abilities_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.abilities
    ADD CONSTRAINT abilities_pkey PRIMARY KEY (id);


--
-- TOC entry 2949 (class 2606 OID 16898)
-- Name: cities cities_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cities
    ADD CONSTRAINT cities_pkey PRIMARY KEY (id);


--
-- TOC entry 2963 (class 2606 OID 17009)
-- Name: cv_cover_letter cv_cover_letter_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cv_cover_letter
    ADD CONSTRAINT cv_cover_letter_pkey PRIMARY KEY (id);


--
-- TOC entry 2951 (class 2606 OID 16948)
-- Name: educations educations_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.educations
    ADD CONSTRAINT educations_pkey PRIMARY KEY (id);


--
-- TOC entry 2937 (class 2606 OID 16602)
-- Name: employees employees_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (user_id);


--
-- TOC entry 2935 (class 2606 OID 16611)
-- Name: employers employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (user_id);


--
-- TOC entry 2953 (class 2606 OID 16958)
-- Name: experiences experiences_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.experiences
    ADD CONSTRAINT experiences_pkey PRIMARY KEY (id);


--
-- TOC entry 2947 (class 2606 OID 16893)
-- Name: job_advertisements job_advertisements_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisements
    ADD CONSTRAINT job_advertisements_pkey PRIMARY KEY (id);


--
-- TOC entry 2939 (class 2606 OID 16609)
-- Name: job_hunters job_hunters_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_hunters
    ADD CONSTRAINT job_hunters_pkey PRIMARY KEY (user_id);


--
-- TOC entry 2941 (class 2606 OID 16595)
-- Name: jobs jobs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jobs
    ADD CONSTRAINT jobs_pkey PRIMARY KEY (id);


--
-- TOC entry 2957 (class 2606 OID 16978)
-- Name: languages language_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.languages
    ADD CONSTRAINT language_pkey PRIMARY KEY (id);


--
-- TOC entry 2959 (class 2606 OID 16988)
-- Name: links links_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.links
    ADD CONSTRAINT links_pkey PRIMARY KEY (id);


--
-- TOC entry 2961 (class 2606 OID 17030)
-- Name: images uk_ecrv58pdi2t8vmjwca8k2lu2n; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.images
    ADD CONSTRAINT uk_ecrv58pdi2t8vmjwca8k2lu2n UNIQUE (job_hunter_id);


--
-- TOC entry 2933 (class 2606 OID 16586)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);


--
-- TOC entry 2945 (class 2606 OID 16878)
-- Name: verification_by_employees verification_by_employees_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_by_employees
    ADD CONSTRAINT verification_by_employees_pkey PRIMARY KEY (id);


--
-- TOC entry 2943 (class 2606 OID 16768)
-- Name: verification_codes verification_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT verification_pkey PRIMARY KEY (id);


--
-- TOC entry 2970 (class 2606 OID 16899)
-- Name: job_advertisements cities_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisements
    ADD CONSTRAINT cities_id FOREIGN KEY (city_id) REFERENCES public.cities(id) NOT VALID;


--
-- TOC entry 2965 (class 2606 OID 16612)
-- Name: employees emplooyes_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT emplooyes_user_id FOREIGN KEY (user_id) REFERENCES public.users(user_id) NOT VALID;


--
-- TOC entry 2971 (class 2606 OID 16904)
-- Name: job_advertisements employer_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisements
    ADD CONSTRAINT employer_id FOREIGN KEY (employer_id) REFERENCES public.employers(user_id) NOT VALID;


--
-- TOC entry 2964 (class 2606 OID 16617)
-- Name: employers employers_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_user_id FOREIGN KEY (user_id) REFERENCES public.users(user_id) NOT VALID;


--
-- TOC entry 2973 (class 2606 OID 16949)
-- Name: educations job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.educations
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id) NOT VALID;


--
-- TOC entry 2974 (class 2606 OID 16959)
-- Name: experiences job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.experiences
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2976 (class 2606 OID 16979)
-- Name: languages job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.languages
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2977 (class 2606 OID 16989)
-- Name: links job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.links
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2978 (class 2606 OID 16997)
-- Name: images job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.images
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2979 (class 2606 OID 17010)
-- Name: cv_cover_letter job_hunter_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cv_cover_letter
    ADD CONSTRAINT job_hunter_id FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2975 (class 2606 OID 16969)
-- Name: abilities job_hunter_İd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.abilities
    ADD CONSTRAINT "job_hunter_İd" FOREIGN KEY (job_hunter_id) REFERENCES public.job_hunters(user_id);


--
-- TOC entry 2966 (class 2606 OID 16622)
-- Name: job_hunters job_hunters_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_hunters
    ADD CONSTRAINT job_hunters_user_id FOREIGN KEY (user_id) REFERENCES public.users(user_id) NOT VALID;


--
-- TOC entry 2972 (class 2606 OID 16909)
-- Name: job_advertisements job_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisements
    ADD CONSTRAINT job_id FOREIGN KEY (position_id) REFERENCES public.jobs(id) NOT VALID;


--
-- TOC entry 2969 (class 2606 OID 16884)
-- Name: verification_by_employees user_id_employer; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_by_employees
    ADD CONSTRAINT user_id_employer FOREIGN KEY (employer_id) REFERENCES public.employers(user_id) NOT VALID;


--
-- TOC entry 2968 (class 2606 OID 16879)
-- Name: verification_by_employees user_id_empoyee; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_by_employees
    ADD CONSTRAINT user_id_empoyee FOREIGN KEY (employee_id) REFERENCES public.employees(user_id) NOT VALID;


--
-- TOC entry 2967 (class 2606 OID 16869)
-- Name: verification_codes user_id_from_user; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT user_id_from_user FOREIGN KEY (user_id) REFERENCES public.users(user_id) NOT VALID;


-- Completed on 2021-06-04 14:59:39

--
-- PostgreSQL database dump complete
--
