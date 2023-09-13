package MainMethod;

// Trong Java, main method là một phương thức đặc biệt và quan trọng, được sử dụng để bắt đầu thực thi chương trình Java. 
// Phương thức main là một phần bắt buộc của mọi chương trình Java và là điểm khởi đầu cho việc thực thi chương trình.
public class Main {
  // Khái báo main method:
  // Đây là một phương thức public (công khai), static (tĩnh), không trả về giá
  // trị (void), và có tên là main.
  // Tham số String[] args là một mảng các chuỗi được sử dụng để chuyển đối số
  // dòng lệnh (command-line arguments) vào chương trình.

  // Điểm khởi đầu:
  // Khi bạn chạy một chương trình Java, nó sẽ bắt đầu thực thi từ phương thức
  // main. Tất cả các câu lệnh trong phương thức main sẽ được thực thi theo thứ
  // tự.

  // Cách sử dụng args tham số:
  // Biến args là một mảng chuỗi (String[]) chứa các đối số được truyền vào từ
  // dòng lệnh khi bạn chạy chương trình. Ví dụ, nếu bạn chạy chương trình với
  // lệnh java MyProgram arg1 arg2, thì args sẽ chứa ["arg1", "arg2"].
  // Bạn có thể sử dụng args để thực hiện các thao tác xử lý dựa trên đối số từ
  // dòng lệnh.

  // Điểm kết thúc:
  // Khi tất cả các câu lệnh trong phương thức main đã được thực thi hoặc khi bạn
  // sử dụng lệnh return, chương trình kết thúc thực thi.
  public static void main(String[] args) {
    System.out.println("Main method");
  }
}
