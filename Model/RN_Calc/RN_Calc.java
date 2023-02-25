import Homework.JAVA_OOP.Model.Method.CalcModel;

public class RN_Calc extends CalcModel {

    Integer mX;
    Integer nX;

    Integer mY;
    Integer nY;

    Integer mRes;
    Integer nRes;

    Integer[] result = new Integer[2];

    /**
     * Ввод первого первого рационального числа
     */
    @Override
    public void setX(Integer[] value) {
        super.xRN = value;
        mX = xRN[0];
        nX = xRN[1];

    }

    /**
     * Ввод второго рационального числа
     */

    @Override
    public void setY(Integer[] value) {
        super.yRN = value;
        mY = yRN[0];
        nY = yRN[1];
    }

    /**
     * Сложение рациональных чисел m1/n1 + m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    @Override
    public Integer[] getSum() {
 
       
        if (nX == nY) {
            mRes = mX + mY;
            nRes = nX;
        } else {
            mRes = mX * nY + mY * nX;
            nRes = nY * nX;
        }

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }

    /**
     * Разность рациональных чисел m1/n1 - m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    @Override
    public Integer[] getSub() {
  

        if (nX == nY) {
            mRes = mX - mY;
            nRes = nX;
        } else {
            mRes = mX * nY - mY * nX;
            nRes = nY * nX;
        }
        result[0] = mRes;
        result[1] = nRes;
        return result;
    }

    /**
     * Произведение рациональных чисел m1/n1 * m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    @Override
    public Integer[] getMult() {

 
        mRes = mX * mY;
        nRes = nX * nY;

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }

    /**
     * Деление рациональных чисел m1/n1 / m2/n2
     * m - числитель, n- знаменатель
     * 
     * @return Возвращения математической операции в формате Integer[m3,n3]
     */
    @Override
    public Integer[] getDiv() {

        mRes = mX * nY;
        nRes = nX * mY;

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }

}
