<h1 align="center">🖥️ KioskProject</h1>
<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-007396?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-red?style=for-the-badge&logo=intellij-idea"/>
  <img src="https://img.shields.io/badge/Platform-Console-lightgrey?style=for-the-badge"/>
</p>

<p align="center">
자바를 활용한 간단한 콘솔 기반 키오스크 프로젝트입니다.
</p>

---

## 📌 프로젝트 개요

- 사용자가 메뉴를 선택하고 주문할 수 있는 콘솔 키오스크 프로그램입니다.
- Java OOP 설계를 기반으로 단계별로 기능을 구현합니다.
- 텍스트 기반 UI지만, 실무 구조처럼 클래스를 분리해 설계합니다.

---

## 🚀 기술 스택

| 항목       | 내용                         |
|------------|------------------------------|
| 💻 Language   | ![Java](https://img.shields.io/badge/Java-17-007396?logo=java&logoColor=white) |
| 🛠️ IDE       | IntelliJ IDEA |
| 📦 Build Tool | 없음 (Java 기본 프로젝트) |
| 🔗 협업툴     | Git + GitHub |

---

## 📁 폴더 구조

src/ ├── lv1/ │ └── Lv1Main.java ├── lv2/ │ ├── Lv2Main.java │ └── MenuItem.java ├── lv3/ │ ├── Lv3Main.java │ ├── Kiosk.java │ └── MenuItem.java ├── lv4/ │ ├── Lv4Main.java │ ├── Kiosk.java │ ├── Menu.java │ └── MenuItem.java


---

## ✨ 주요 기능

- 메뉴 출력 및 사용자 선택 기능
- `Menu`, `MenuItem`, `Kiosk` 등 클래스를 분리하여 OOP 설계
- 사용자 입력 및 예외 처리
- 구조 확장에 적합하도록 단계별로 구현 (Lv1 ~ Lv4)

---

## 🔀 브랜치 전략

| 브랜치 | 용도            |
|--------|-----------------|
| `main` | 배포 및 안정 버전 |
| `dev`  | 개발 및 테스트 버전 |

---

## 🧑‍💻 실행 방법

1. 저장소 클론:
   ```bash
   git clone https://github.com/ROKSSAN/KioskProject.git

