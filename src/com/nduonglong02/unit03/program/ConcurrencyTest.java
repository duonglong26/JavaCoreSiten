package com.nduonglong02.unit03.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 3, 4, 2, 3, 6, 3, 3, 8);

        System.out.println("Before remove: size of list = " + list.size());

        /* Remove with for i */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3 ) {
                list.remove(i);
                i--;
            }
            /* -> Xóa các phẩn tử có giá trị bằng 3 trong list */
        }

        /* Remove with forEach */
//        try {
//            list.forEach(v -> {
//                System.out.println(v);
//                if (v == 3) list.remove(v);
//                /* -> Xóa phần tử v gặp phải đầu tiên. Đang gặp lỗi vì xóa phần tử khi dang duyệt mảng */
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /* Remove with iterator */
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() == 3) iterator.remove();
//            /* -> Xóa tất cả phần tử bằng 3 */
//        }

        /* Remove with remove if */
//        list.removeIf(item -> {return item == 3;});
        /* -> Xóa tất cả phần tử bằng 3 */

        /* Remove with singleton */
//        list.removeAll(Collections.singleton(3));
        /* -> Xóa tất cả phần tử bằng 3 */

        System.out.println("After remove: size of list = " + list.size());
    }
}
