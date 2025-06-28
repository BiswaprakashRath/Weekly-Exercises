BEGIN
  FOR cust IN (SELECT CustomerID, Age, InterestRate FROM Customers)
  LOOP
    IF cust.Age > 60 THEN
      UPDATE Customers
      SET InterestRate = InterestRate * 0.99
      WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/