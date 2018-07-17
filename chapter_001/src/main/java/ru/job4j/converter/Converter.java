package ru.job4j.converter;

    /**
     * Конвертор валюты.
     */
    public class Converter {

        /**
         * Конвертируем рубли в евро.
         * @param value рубли.
         * @return Евро.
         */
        public int rubleToEuro(int value) {
            return  70 / value;
         }
        /**
         * Конвертируем рубли в долларв.
         * @param value рубли.
         * @return Доллары.
         */
        public int rubleToDollar(int value) {
            return  60 / value;
        }
        /**
         * Конвертируем доллары в рубли.
         * @param value рубли.
         * @return Доллары.
         */
        public int dollarToRuble(int value) {
            return  60 * value;
        }
        /**
         * Конвертируем евро в рубли.
         * @param value рубли.
         * @return Евро.
         */
        public int euroToRuble(int value) {
            return  70 * value;
        }
    }