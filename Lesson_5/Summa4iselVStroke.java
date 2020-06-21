package JavaRushTask.JR_5;

class Summa4iselVStroke {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5465));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String numberS = Integer.toString(number);// созд строку которая ссылается на, элем оборач в интежер, преобразуем эл-ты в строку
        String[] a = numberS.split("");//созд массив, с элем из нашей строки, разделяем строку на строки
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=Integer.parseInt(a[i]); //обратно переводи каждый эл-т массива из строки в число
        }
        return sum;
    }
}
