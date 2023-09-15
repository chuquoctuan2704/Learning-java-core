Bracket expressions trong biểu thức chính quy (regular expressions hoặc regex) là một cách để xác định một tập hợp các ký tự mà bạn muốn so khớp trong chuỗi văn bản. Bracket expressions cho phép bạn tạo các tập hợp ký tự tùy chỉnh và xác định rằng chỉ có một trong các ký tự trong tập hợp đó được so khớp.

Dưới đây là một số cách sử dụng bracket expressions trong regex:

1. Dãy ký tự đơn: Bạn có thể liệt kê các ký tự cụ thể mà bạn muốn tìm kiếm. Ví dụ: [abc] so khớp với bất kỳ ký tự nào trong danh sách "a", "b", hoặc "c".

2. Dãy ký tự trong khoảng: Bạn có thể xác định một khoảng các ký tự bằng cách sử dụng dấu gạch nối -. Ví dụ: [a-z] so khớp với bất kỳ ký tự chữ cái nào từ "a" đến "z".

3. Dãy ký tự phủ định: Bạn có thể sử dụng ^ ở đầu một bracket expression để chỉ định dãy ký tự không muốn so khớp. Ví dụ: [^0-9] so khớp với bất kỳ ký tự nào không phải là số.

4. Sử dụng ký tự thoát (escape): Nếu bạn muốn tìm kiếm ký tự đặc biệt như [, ], ^, bạn cần sử dụng \ trước chúng. Ví dụ: \[ so khớp với dấu [.

5. Ký tự thoát đặc biệt trong bracket expression: Một số ký tự đặc biệt như ^, -, ] không cần escape khi được sử dụng bên trong một bracket expression.

Dưới đây là một số ví dụ về cách sử dụng bracket expressions trong regex:

- [abc]: So khớp với một trong các ký tự "a", "b", hoặc "c".
- [a-z]: So khớp với bất kỳ ký tự chữ cái nào từ "a" đến "z".
- [A-Za-z]: So khớp với bất kỳ ký tự chữ cái hoa hoặc thường.
- [0-9]: So khớp với bất kỳ chữ số nào.
- [^0-9]: So khớp với bất kỳ ký tự nào không phải là số.

Bracket expressions cho phép bạn xác định các tập hợp phức tạp hơn của ký tự mà bạn muốn tìm kiếm trong chuỗi văn bản và là một phần quan trọng của regex để xác định các mẫu phức tạp.
