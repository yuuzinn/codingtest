-- 코드를 입력하세요
SELECT ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME
from ANIMAL_OUTS
left join ANIMAL_INS on ANIMAL_INS.animal_id = ANIMAL_OUTS.animal_id
where ANIMAL_INS.animal_id is null