-- 코드를 입력하세요
SELECT UGB.BOARD_ID, UGB.WRITER_ID, UGB.TITLE, UGB.PRICE, 
    CASE
            WHEN (UGB.STATUS = 'SALE') THEN '판매중'
            WHEN (UGB.STATUS = 'RESERVED') THEN '예약중'
            ELSE '거래완료'
    END AS STATUS
FROM USED_GOODS_BOARD AS UGB
WHERE CREATED_DATE = '2022-10-05'
ORDER BY BOARD_ID DESC