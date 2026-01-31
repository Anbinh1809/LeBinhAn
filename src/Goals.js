import { useState } from "react";

export default function Goals() {
  const [goals, setGoals] = useState([
    { id: 1, text: "Có thêm kiến thức", done: false },
    { id: 2, text: "Công việc ổn định", done: false },
  ]);

  const handleToggle = (id) => {
    const nextGoals = goals.map((g) => {
      if (g.id === id) {
        return { ...g, done: !g.done };
      } else {
        return g;
      }
    });
    setGoals(nextGoals);
  };

  return (
    <section className="p-6 text-center space-y-4">
      <div className="bg-red-600 text-white px-6 py-2 rounded-full font-bold inline-block">
        Mục Tiêu
      </div>
      <div className="flex flex-col gap-2">
        {goals.map((g) => (
          <button
            key={g.id}
            onClick={() => handleToggle(g.id)}
            className={`p-3 rounded-xl font-bold ${
              g.done ? "bg-green-700 text-white" : "bg-green-400"
            }`}
          >
            {g.text} {g.done ? "✓" : ""}
          </button>
        ))}
      </div>
    </section>
  );
}
