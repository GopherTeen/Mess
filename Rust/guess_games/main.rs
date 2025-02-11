use rand::Rng;
use std::{cmp::Ordering, io};

/*
    Rust 学习  2024.11.20
*/

/*
添加 crate  一般是从 crates.io 网站获取
    > 命令行：cargo add rand@0.8.5
    > Cargo.toml 文件
*/

fn main() {
    println!("Guess the number!");

    let secret_number = rand::thread_rng().gen_range(1..101); // gen_range(1..=100)
    println!("The secret number is: {}", secret_number);

    loop {
        println!("Please input your guess.");

        let mut guess = String::new();
        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        // 遮蔽（shadowing）：同一块作用域可以重复命名
        // parse：v.对（句子）作语法分析；仔细研究，分析
        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("You guessed: {}", guess);

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }
}