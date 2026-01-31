export default function Skills() {
  const listSkills = [
    { id: 1, name: "HTML/CSS", desc: "Xây dựng cấu trúc web." },
    { id: 2, name: "C Programming", desc: "Xử lý logic hệ thống." },
  ];

  return (
    <section className="p-6 bg-gray-100">
      <h2 className="bg-gray-300 inline-block px-4 py-1 rounded font-bold mb-4">
        Kỹ năng
      </h2>
      <div className="space-y-4">
        {listSkills.map((s) => (
          <div key={s.id} className="bg-gray-200 p-4 rounded-xl">
            <h4 className="font-bold">{s.name}</h4>
            <p className="text-xs">{s.desc}</p>
          </div>
        ))}
      </div>
    </section>
  );
}
