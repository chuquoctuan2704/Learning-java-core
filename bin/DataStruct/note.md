# Dưới đây là giải thích về các cấu trúc dữ liệu và các loại bộ sưu tập phổ biến trong Java, cùng với một số so sánh và lựa chọn khi nào nên sử dụng chúng:

- Array (Mảng):
  Mảng là một tập hợp các phần tử có cùng kiểu dữ liệu và được lưu trữ liên tiếp trong bộ nhớ.
  Kích thước của mảng cố định và không thể thay đổi sau khi được khai báo.

- ArrayList:
  ArrayList là một lớp trong Java thuộc gói java.util và triển khai giao diện List.
  Nó là một danh sách động có kích thước có thể thay đổi, cho phép thêm, xóa và truy xuất các phần tử một cách dễ dàng.
  ArrayList thường được sử dụng khi cần một danh sách động và cần thực hiện nhiều thao tác truy xuất và thay đổi.

- LinkedList:
  LinkedList cũng thuộc gói java.util và triển khai giao diện List.
  Nó là một danh sách liên kết hai chiều, cho phép thêm, xóa và truy xuất các phần tử một cách hiệu quả.
  LinkedList thường được sử dụng khi cần thêm hoặc xóa phần tử từ đầu hoặc cuối danh sách một cách nhanh chóng.

- HashMap:
  HashMap là một lớp trong Java thuộc gói java.util và triển khai giao diện Map.
  Nó lưu trữ các cặp key-value và cho phép truy xuất giá trị dựa trên key.
  HashMap không đảm bảo thứ tự của các phần tử và cho phép key là null.

- HashSet:
  HashSet thuộc gói java.util và triển khai giao diện Set.
  Nó lưu trữ một tập hợp các phần tử duy nhất, không cho phép phần tử trùng lặp.
  HashSet không đảm bảo thứ tự của các phần tử và cho phép phần tử null.

- TreeMap:
  TreeMap là một lớp trong Java thuộc gói java.util và triển khai giao diện SortedMap.
  Nó lưu trữ các cặp key-value và sắp xếp chúng dựa trên thứ tự tăng dần của key.
  TreeMap đảm bảo thứ tự của các phần tử và cho phép key là null.

- TreeSet:
  TreeSet thuộc gói java.util và triển khai giao diện SortedSet.
  Nó lưu trữ một tập hợp các phần tử duy nhất và sắp xếp chúng dựa trên thứ tự tăng dần.
  TreeSet đảm bảo thứ tự của các phần tử và không cho phép phần tử trùng lặp.

# So sánh:

- Mảng (Array):
  Cố định kích thước.
  Không có phương thức thêm/xóa động.
  Duyệt nhanh vì dữ liệu liên tiếp trong bộ nhớ.

- ArrayList:
  Kích thước có thể thay đổi.
  Có phương thức thêm/xóa động.
  Hiệu suất truy xuất nhanh hơn khi duyệt qua nhiều phần tử.

- LinkedList:
  Kích thước có thể thay đổi.
  Hiệu suất tốt cho việc thêm/xóa ở đầu/cuối danh sách.

- HashMap:
  Lưu trữ cặp key-value.
  Thời gian truy xuất dựa trên key nhanh chóng.
  Không đảm bảo thứ tự.

- HashSet:
  Lưu trữ tập hợp các phần tử duy nhất.
  Thời gian truy xuất nhanh chóng.
  Không đảm bảo thứ tự.

- TreeMap:
  Lưu trữ cặp key-value và sắp xếp dựa trên key.
  Đảm bảo thứ tự dựa trên key.
  Truy xuất theo thứ tự nhanh chóng.

- TreeSet:
  Lưu trữ tập hợp các phần tử duy nhất và sắp xếp dựa trên thứ tự.
  Đảm bảo thứ tự dựa trên thứ tự.
  Truy xuất theo thứ tự nhanh chóng.

# Lựa chọn khi nào nên sử dụng:

Sử dụng mảng (Array) khi bạn cần một cấu trúc dữ liệu có kích thước cố định và hiệu suất truy xuất nhanh.
Sử dụng ArrayList khi bạn cần một danh sách động có kích thước có thể thay đổi và thực hiện nhiều thao tác thêm/xóa.
Sử dụng LinkedList khi bạn cần thêm hoặc xóa phần tử từ đầu/cuối danh sách một cách nhanh chóng.
Sử dụng HashMap khi bạn cần ánh xạ key đến giá trị và không quan trọng về thứ tự.
Sử dụng HashSet khi bạn cần lưu trữ một tập hợp các phần tử duy nhất và không quan trọng về thứ tự.
Sử dụng TreeMap khi bạn cần ánh xạ key đến giá trị và cần sắp xếp dữ liệu theo key.
Sử dụng TreeSet khi bạn cần lưu trữ một tập hợp các phần tử duy nhất và cần sắp xếp chúng theo thứ tự.
