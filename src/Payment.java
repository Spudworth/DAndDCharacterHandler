public class Payment {


       private String surName;
       private String foreName;
       private double cardNumber;
       private int expiryDate;
       private int securityCode;



        public Payment(String surname, String foreName,  double cardNumber, int expiryDate, int securityCode)
        {
            setSurName(surname);
            setForeName(foreName);
            setCardNumber(cardNumber);
            setExpiryDate(expiryDate);
            setSecurityCode(securityCode);
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getForeName() {
            return foreName;
        }

        public void setForeName(String foreName) {
            this.foreName = foreName;
        }

        public  double getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber( double cardNumber) {
            this.cardNumber = cardNumber;
        }

        public int getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(int expiryDate) {
            this.expiryDate = expiryDate;
        }

        public int getSecurityCode() {
            return securityCode;
        }

        public void setSecurityCode(int securityCode) {
            this.securityCode = securityCode;
        }

        public String toString() {
            return "PaymentAgain{" +
                    "surName='" + surName + '\'' +
                    ", foreName='" + foreName + '\'' +
                    ", cardNumber=" + cardNumber +
                    ", expiryDate=" + expiryDate +
                    ", securityCode=" + securityCode +
                    '}';
        }


    }//End

