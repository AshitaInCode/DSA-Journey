# Day 01 – Binary Search Basics

## Topic
Binary Search – Searching an element & finding floor in a sorted array

## What I studied today
- Understood what searching means in an array
- Learned Binary Search concept
- Learned how Binary Search works for:
  - Finding an element k
  - Finding the floor of a number in a sorted array

## Key Concepts
- Binary Search works only on **sorted arrays**
- Time complexity: **O(log N)**
- Idea:
  - Divide the search space into half
  - Compare mid element with target
  - Eliminate half of the array each step

## Floor of an Element
- Floor = greatest element ≤ target
- While searching:
  - If mid ≤ target → possible answer, move right
  - Else → move left

## Practice Done
| Question | Platform | Notes |
|--------|---------|------|
| Search element in sorted array | LeetCode | Revised basic binary search logic |
| Floor in a sorted array | GFG | Understood condition-based movement |

## Mistakes / Learnings
- Binary Search logic looks simple but needs careful conditions
- Boundary handling (low, high, mid) is important

## Revision Notes
- Always check if array is sorted
- Binary Search = thinking in halves, not linear scanning

## Motivation
Slow understanding today saves confusion tomorrow.
